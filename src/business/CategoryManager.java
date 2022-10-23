package business;

import core.logger.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao _categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao _categoryDao, Logger[] loggers) {
        this._categoryDao = _categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{
        for (Category category1: _categoryDao.getAll()){
            if (category.getName() == category1.getName()) {
                throw new Exception("Kategori ismi aynı olamaz!!!!");
            }
        }

        _categoryDao.add(category);
        for (Logger logger: loggers) {
            logger.log(category.getName());
        }
    }
}
