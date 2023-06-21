package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = Arrays.asList(
            new Contact(1L, "neelesh@gmail.com", "Neelesh", 1311L),
            new Contact(2L, "shailesh@gmail.com", "Shailesh", 1311L),
            new Contact(3L, "mayank@gmail.com", "Mayank", 1312L),
            new Contact(4L, "lokendraa@gmail.com", "Lokendra", 1314L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
