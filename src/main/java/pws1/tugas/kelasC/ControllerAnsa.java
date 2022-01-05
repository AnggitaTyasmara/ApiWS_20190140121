/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pws1.tugas.kelasC;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/pakaian")

public class ControllerAnsa {
    

    @Autowired
    private Ansarepo ansa;

    @GetMapping("/ansa")
    public List<Produk> getAllProduk() {
        return ansa.findAll();
    }

    @GetMapping("/ansa/{idproduct}")
    public Produk getProdukById(@PathVariable String idproduct) {
        return ansa.findById(idproduct).get();
    }

    @PostMapping("/ansa")
    public Produk saveProdukDetails(@RequestBody Produk p) {
        return ansa.save(p);
    }

    @PutMapping("/ansa")
    public Produk updateProduk(@RequestBody Produk p) {
        return ansa.save(p);
    }

    @DeleteMapping("/ansa/{idproduct}")
    public ResponseEntity<HttpStatus> deleteProdukById(@PathVariable String idproduct) {
        ansa.deleteById(idproduct);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

