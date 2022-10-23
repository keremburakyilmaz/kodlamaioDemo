package dataAccess;

import entities.Category;

public interface CategoryDao {
    Category[] getAll();
    void add(Category category);
    void delete(Category category);
    void update(Category category);
}
