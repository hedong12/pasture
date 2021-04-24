package com.dscy.pasture.service;

import com.dscy.pasture.entity.Address;
import com.github.pagehelper.PageInfo;

public interface AddressService {

    PageInfo getAddressList(Integer currentPage, String username);

    Address selectAddressById(Integer id);

    int delAddressById(Integer addressId);

    int doUpdateAddressById(Address address);
}
