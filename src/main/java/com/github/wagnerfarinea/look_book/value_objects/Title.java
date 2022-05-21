package com.github.wagnerfarinea.look_book.value_objects;

import com.github.wagnerfarinea.look_book.exceptions.RequiredFieldException;
import com.github.wagnerfarinea.look_book.utils.StringUtils;

public class Title {
    private final String text;

    public Title(String title) {
        if (StringUtils.isBlank(title)) {
            throw new RequiredFieldException("Book Title");
        }
        this.text = title;
    }

    public String getText() {
        return text;
    }
}
