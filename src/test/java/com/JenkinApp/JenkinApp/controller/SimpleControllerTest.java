package com.JenkinApp.JenkinApp.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SimpleControllerTest {

        @InjectMocks
        private SimpleController greetingController;

        @Test
        public void testGreet() {
            String result = greetingController.greet("Anamika");
            assertEquals("Hello, Anamika!", result);
        }

}
