package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public Category[] getAll() {
        System.out.println("Jdbc ile kategori getirildi.");
        return new Category[6];
    }

    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile kategori eklendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Jdbc ile kategori silindi: " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Jdbc ile kategori güncellendi: " + category.getName());
    }
}
