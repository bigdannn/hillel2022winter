package com.template.mapper;

import com.template.dto.UserDto;
import com.template.dto.UserShortDto;
import com.template.entity.User;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(User.class, UserDto.class)
                .mapNulls(false)
                .byDefault()
                .register();
        factory.classMap(UserDto.class, User.class)
                .mapNulls(false)
                .byDefault()
                .register();
        factory.classMap(User.class, UserShortDto.class)
                .mapNulls(false)
                .byDefault()
                .register();
    }
}
