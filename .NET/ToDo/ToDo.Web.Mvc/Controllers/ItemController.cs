using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using System.Diagnostics;
using ToDo.Application;
using ToDo.Application.Dtos.Item;
using ToDo.Web.Mvc.Models;

namespace ToDo.Web.Mvc.Controllers
{
    public class ItemController : Controller
    {
        protected IItemAppService service;

        public ItemController(IItemAppService service)
        {
            this.service = service;
        }
        public async Task<IActionResult> Index()
        {
            var items = await service.GetAllAsync();

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
                var item = new ItemResponseDto();
                item.Description = createItemModel.Description;
                await service.AddAsync(item);
                return RedirectToAction(nameof(Index));
            }
            return View(createItemModel);
        }
        public async Task<IActionResult> Edit([Bind("Id", "Description", "CreatedAt", "Done")] ItemResponseDto item)
        {
            return View(item);
        }
        [HttpPost, ActionName("Edit")]
        public async Task<IActionResult> EditItem([Bind("Id", "Description", "CreatedAt", "Done")] ItemResponseDto item)
        {
            Debug.WriteLine("item:" + item.Description);
            await service.EditAsync(item);
            return RedirectToAction(nameof(Index));
        }
        public async Task<IActionResult> Delete()
        {
            return View();
        }
        [HttpPost, ActionName("Delete")]
        public async Task<IActionResult> DeleteItem(String id)
        {
            if (ModelState.IsValid && id != null)
            {
                await service.DeleteAsync(id);
                return RedirectToAction(nameof(Index));
            }
            return View();
        }        
    }
}
