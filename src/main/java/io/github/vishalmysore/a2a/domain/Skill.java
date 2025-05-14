package io.github.vishalmysore.a2a.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Skill {
    private String id;
    private String name;
    private String description;
    private String[] tags;
    private String[] examples;
    private String[] inputModes;
    private String[] outputModes;


}

