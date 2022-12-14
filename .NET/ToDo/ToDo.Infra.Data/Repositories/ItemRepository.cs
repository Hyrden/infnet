using Dapper;
using Microsoft.Extensions.Configuration;
using System.Data.Common;
using System.Data.SqlClient;
using System.Diagnostics;
using ToDo.Domain.Entities;
using ToDo.Domain.Interface;

namespace ToDo.Infra.Data.Repositories
{
    public class ItemRepository : IItemRepository
    {
        private readonly string connectionString;
        public ItemRepository(IConfiguration configuration)
        {
            connectionString = configuration.GetConnectionString("ToDoDb");
        }
        public async Task<Item> GetItemAsync(String id)
        {
            Item result;
            var query = "SELECT * FROM Items WHERE Id = "+ "'"+id+"'";
            using (var con = new SqlConnection(connectionString))
            {
                try
                {
                    con.Open();
                    IEnumerable<Item> aux = await con.QueryAsync<Item>(query);
                    result = aux.ElementAt(0);
                }
                catch (Exception)
                {
                    throw;
                }
                finally
                {
                    con.Close();
                }
                return result;
            };
        }
        public async Task<IEnumerable<Item>> GetAllAsync()
        {
            IEnumerable<Item> result;
            var query = "SELECT * FROM Items";
            using (var con = new SqlConnection(connectionString))
            {   
                try
                {
                    con.Open();
                    result = await con.QueryAsync<Item>(query);
                }
                catch (Exception)
                {
                    throw;
                }
                finally
                {
                    con.Close();
                }
                return result;
            };

        }

        public async Task AddAsync(Item item)
        {
            var query = "insert into Items(Id, Description, Done, CreatedAt) values(@Id, @Description, @Done, @CreatedAt)";
            using (var con = new SqlConnection(connectionString))
            {    
                try
                {
                    con.Open();
                    await con.ExecuteAsync(query, item);
                }
                catch (Exception)
                {
                    throw;
                }
                finally
                {
                    con.Close();
                }
            };
        }

        public async Task EditAsync(Item item)
        {
            Debug.WriteLine("EditAsync repository");
            Debug.WriteLine(item.Id+" "+item.Description+ " "+ item.Done);
            var count = 0;
            var query = "UPDATE Items SET Description = @Description, Done = @Done WHERE Id = @Id";
            using (var con = new SqlConnection(connectionString))
            {
                try
                {
                    con.Open();
                    
                    count = await con.ExecuteAsync(query, item);
                }
                catch (Exception)
                {
                    throw;
                }
                finally
                {
                    con.Close();
                }
            };
        }
        public async Task DeleteAsync(String id)
        {
            var query = "DELETE FROM Items WHERE Id = " + "'" + id + "'"; ;
            using (var con = new SqlConnection(connectionString))
            {
                try
                {
                    con.Open();
                    await con.ExecuteAsync(query);
                }
                catch (Exception)
                {
                    throw;
                }
                finally
                {
                    con.Close();
                }
            };
        }
    }
}
