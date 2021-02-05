package com.gadgetmart.controller;

import com.gadgetmart.model.Supplier;
import com.gadgetmart.model.UserProfile;
import com.gadgetmart.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author thilinamullewidane
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/new-supplier")
    public ResponseEntity<Integer> registerSupplier(@RequestBody Supplier supplier) {
        return new ResponseEntity<>(supplierService.registerSupplier(supplier), HttpStatus.OK);
    }

    @PutMapping("/update-supplier")
    public ResponseEntity<Integer> updateSupplier(@RequestBody Supplier supplier) {
        return new ResponseEntity<>(supplierService.updateSupplier(supplier), HttpStatus.OK);
    }

    @GetMapping("/get-supplier-detail/{supplierId}")
    public ResponseEntity<Supplier> getSupplierDetail(@PathVariable String supplierId) {
        return new ResponseEntity<>(supplierService.getSupplierDetail(supplierId), HttpStatus.OK);
    }

    @GetMapping("/get-supplier-list")
    public ResponseEntity<List<Supplier>> getSupplierList() {
        return new ResponseEntity<>(supplierService.getSupplierList(), HttpStatus.OK);
    }
}
