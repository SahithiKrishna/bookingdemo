package com.example.demo.service;

import com.example.demo.entity.Hotel;
import com.example.demo.repository.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {

    @Autowired
    private final HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Long id) {
        return null;
    }
}
