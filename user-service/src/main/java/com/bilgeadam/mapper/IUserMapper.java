package com.bilgeadam.mapper;

import com.bilgeadam.dto.request.CreateUserRequestDto;
import com.bilgeadam.dto.request.UpdateUserForAuthAndAddressDto;
import com.bilgeadam.dto.request.UpdateUserRequestDto;
import com.bilgeadam.dto.response.GetUserProfileResponseDto;
import com.bilgeadam.repository.entity.UserProfile;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {
    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);
    UserProfile createUserProfileToUserProfile(final CreateUserRequestDto dto);

    GetUserProfileResponseDto getUserProfileFromUserProfile(final UserProfile userProfile);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    UserProfile updateUserRequestDtoToUserProfile(final UpdateUserRequestDto dto, @MappingTarget UserProfile userProfile);
    UpdateUserForAuthAndAddressDto updateUserForAuthAndAddressFromUser(final UserProfile userProfile);
}
