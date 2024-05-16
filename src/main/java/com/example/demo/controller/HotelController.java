package com.example.demo.controller;

import com.example.demo.entity.Hotel;
import com.example.demo.service.HotelService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("v1/hotel")
@Slf4j
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels() {
        System.out.println("entered");
        List<Hotel> hotels = hotelService.getAllHotels();
        System.out.println(hotels);
        return hotels;
    }

    @GetMapping("/hotels/{hotelId}")
    public Hotel getHotelById(@PathVariable Long hotelId) {
        return hotelService.getHotelById(hotelId);
    }
}
