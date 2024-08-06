package org.example.persistence.Crud;

public interface CreateModel<Entity>{
    public Entity create (Entity request);
}
