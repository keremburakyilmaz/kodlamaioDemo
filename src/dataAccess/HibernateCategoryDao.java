package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public Category[] getAll() {
        System.out.println("Hibernate ile kategori getirildi.");
        return new Category[5];
    }

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori eklendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile kategori silindi: " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile kategori güncellendi: " + category.getName());
    }
}
