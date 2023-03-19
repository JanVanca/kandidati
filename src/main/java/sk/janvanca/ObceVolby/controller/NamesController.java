package sk.janvanca.ObceVolby.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.janvanca.ObceVolby.dto.NamesDto;
import sk.janvanca.ObceVolby.service.NamesService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/names")
public class NamesController {

    private final NamesService namesService;

    public NamesController(NamesService namesService) {
        this.namesService = namesService;
    }

    public void skuska() {
        System.out.println("ahoj");
    }

    @GetMapping("{id}")
    public ResponseEntity getName(@PathVariable Integer id) {
        NamesDto namesDto = namesService.getName(id);
        if (namesDto != null) {
            return new ResponseEntity<>(namesDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity getNames() {
        List<NamesDto> namesDtoList = namesService.getNames();
        if (!namesDtoList.isEmpty() && namesDtoList != null) {
            return new ResponseEntity<>(namesDtoList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping({"id"})
    public ResponseEntity deleteName(@PathVariable Integer id) {
        if (namesService.getName(id) != null) {
            namesService.deleteNames(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body("Name with id: " + id + "did not find");
        }
    }

    @PostMapping
    public ResponseEntity createName(@RequestBody NamesDto namesDto) {
        if (namesDto != null) {
            namesService.createName(namesDto);
            return ResponseEntity.ok().build();
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/name")
    public ResponseEntity getNamesByName(@RequestParam String name) {
        List<NamesDto> namesDto = namesService.getNamesByName(name);
        if (!namesDto.isEmpty() && namesDto != null) {
            return new ResponseEntity<>(namesDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/gender")
    public ResponseEntity getNamesByGender(@RequestParam Character gender) {
        List<NamesDto> namesDto = namesService.getNamesByGender(gender);
        if (!namesDto.isEmpty() && namesDto != null) {
            return new ResponseEntity<>(namesDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/update")
    public void updateNames() {
        List<NamesDto> namesDtoList = namesService.getNames();
        System.out.println(namesDtoList);
    }




}
