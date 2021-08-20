package com.kucc.netflix.domain.mapper;

import com.kucc.netflix.domain.dto.UserDto;
import com.kucc.netflix.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

  User toEntity(UserDto.Request dto);
  List<UserDto.Response> toDto(List<User> list);
  UserDto.Response toDto(User user);
}
