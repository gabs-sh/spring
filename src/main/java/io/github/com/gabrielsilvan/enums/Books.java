package io.github.com.gabrielsilvan.enums;

public enum Books {
    ROMANCE("romance", 1),
    FICCAO("ficcao", 2),
    AVENTURA("aventura", 3);

    private String name;
    private Integer key;

    Books(String name, Integer key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public Integer getKey() {
        return key;
    }
}
