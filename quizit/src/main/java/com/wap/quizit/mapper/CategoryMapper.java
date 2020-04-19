package com.wap.quizit.mapper;

import com.wap.quizit.dto.CategoryDTO;
import com.wap.quizit.mapper.decorator.CategoryMapperDecorator;
import com.wap.quizit.model.Category;
import org.mapstruct.DecoratedWith;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
@DecoratedWith(CategoryMapperDecorator.class)
public interface CategoryMapper {

  CategoryDTO map(Category entity);
  Category map(CategoryDTO dto);
}