using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Diagnostics;
using ToDo.Application;
using ToDo.Domain.Entities;
using ToDo.Domain.Interface;
using ToDo.Web.Mvc.Models;

namespace ToDo.Web.Mvc.Controllers
{
    public class ItemController : Controller
    {
        protected IItemRepository repository;
        protected IItemAppService service;

        public ItemController(IItemRepository repository)
        {
            this.repository = repository;
        }
        public async Task<IActionResult> Index()
        {
            var items = await repository.GetAllAsync();

            return View(items);
        }

        public IActionResult Create()
        {
            return View();
        }        

        [HttpPost]
        public async Task<IActionResult> Create([Bind("Description")] CreateItemModel createItemModel)
        {
            if (ModelState.IsValid)
            {
                var item = new Item(createItemModel.Description);
                await repository.AddAsync(item);
                return RedirectToAction(nameof(Index));
            }

            return View(createItemModel);
        }
        public async Task<IActionResult> Edit(string? id)
        {
            if (id == null)
            {
                return NotFound();
            }
            var item = await repository.GetItemAsync(id);
            if(item == null)
            {
                return NotFound();
            }
            return View(item);
        }
        [HttpPost, ActionName("Edit")]
        public async Task<IActionResult> EditItem(Item? item)
        {
            if (item == null)
            {
                return NotFound();
            }
            await repository.EditAsync(item);

            return RedirectToAction(nameof(Index));
        }
        public async Task<IActionResult> Delete(string? id)
        {
            if (id == null)
            {
                return NotFound();
            }
            await repository.DeleteAsync(id);
            return RedirectToAction(nameof(Index));
        }
        [HttpPost, ActionName("Delete")]
        public async Task<IActionResult> DeleteItem(String id)
        {
            if (ModelState.IsValid)
            {
                await repository.DeleteAsync(id);
                return RedirectToAction(nameof(Index));
            }
            return View();
        }        
    }
}
