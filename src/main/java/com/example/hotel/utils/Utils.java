package com.example.hotel.utils;

import com.example.hotel.dto.UserDTO;
import com.example.hotel.entity.User;

import java.security.SecureRandom;

public class Utils {

    private static final String  ALPHANUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private static final SecureRandom secureRandom = new SecureRandom();

    public static String generateRandomAlphamnumeric(int length){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0 ; i< length ; i++){
            int randomIndex = secureRandom.nextInt(ALPHANUMERIC_STRING.length());
            char randomChar = ALPHANUMERIC_STRING.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }

     public static UserDTO mapUserEntityToUserDTO(User user){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setRole(user.getRole());

        return userDTO;
     }

    public static UserDTO mapUserEntityToUserDTOPlusUserBookingAndRooms(User user){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setRole(user.getRole());

//        if(!user.getBookings().isEmpty()){
//            userDTO.setBookings(user.getBookings().stream().map(booking -> mapUserEntityToUserDTOPlusUserBookingAndRooms(booking,false) ));
//        }
        return userDTO;
    }
}
