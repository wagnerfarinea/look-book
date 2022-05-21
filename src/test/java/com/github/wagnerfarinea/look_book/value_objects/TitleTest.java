package com.github.wagnerfarinea.look_book.value_objects;

import com.github.wagnerfarinea.look_book.exceptions.RequiredFieldException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class TitleTest {

    @ParameterizedTest
    @DisplayName("Successful Scenario - Must be create a title")
    @ValueSource(strings = {"Clean Code","1001 Books You Must Read Before You Die"})
    void mustCreateTitle(String text) {
        Title title = new Title(text);
        Assertions.assertEquals(text, title.getText());
    }

    @ParameterizedTest
    @DisplayName("Failed  Scenario - An a exception should be thrown when title is null or empty")
    @ValueSource(strings = {""," "})
    @NullSource
    void mustThrowRequiredException(String text) {
        Assertions.assertThrows(RequiredFieldException.class, () -> new Title(text));
    }
}