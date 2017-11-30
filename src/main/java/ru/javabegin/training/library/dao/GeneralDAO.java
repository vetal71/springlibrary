package ru.javabegin.training.library.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

// общее поведения для всех DAO объектов
public interface GeneralDAO<T>{

    // получение всех записей
    List<T> getAll();

    // поиск записей с любым количеством параметров
    List<T> search(String... searchString);

    // получение объекта по id
    T get(long id);

    // save - обновляет или добавляет объект (один метод на 2 действия)
    T save(T obj);

    // удаление объекта
    void delete(T object);

    // получение списка всех объектов с сортировкой
    List<T> getAll(Sort sort);

    // получение всех запией с постраничностью
    Page<T> getAll(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection);

    // поиск всех записей с постраничностью
    Page<T> search(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, String... searchString);

}
