package com.zadanie.horuszadanie.task;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Wall implements Structure{

    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {

        Optional<Block> colorBlocks = findBlockByColor(color);

        return  colorBlocks;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {

        return blocks.stream()
                .filter(mat -> mat.getMaterial().equals(material))
                .toList();
    }

    @Override
    public int count() {
    int sum = blocks.stream()
            .map(CompositeBlock :: getBlocks)
            .count();

       return sum;

    }
}
