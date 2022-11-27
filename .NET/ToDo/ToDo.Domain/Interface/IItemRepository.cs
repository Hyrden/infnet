using System.Runtime.CompilerServices;
using ToDo.Domain.Entities;

namespace ToDo.Domain.Interface
{
    public interface IItemRepository
    {
        Task<IEnumerable<Item>> GetAllAsync();
        Task AddAsync(Item item);
        Task EditAsync(Item item);
        Task DeleteAsync(String id);
        Task<Item> GetItemAsync(String id);
    }
}
