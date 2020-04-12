package com.yarosla.resttest.demo.controller.Impl;

import com.yarosla.resttest.demo.controller.FishController;
import com.yarosla.resttest.demo.model.Fish;
import com.yarosla.resttest.demo.service.FishService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FishControllerImplTest {
    private static final String NAME = "Perch";
    private static final String TYPE = "Predator";
    private static final int WEIGHT = 500;

    @Mock
    private FishService fishService;

    @InjectMocks
    private FishController fishController;

    @Before
    public void initMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetById(){
        when(fishService.get(anyLong())).thenReturn(getFish());

        Fish fish = fishController.getFishById(123L);
        assertNotEquals(null, fish);
        assertEquals(fish.getName(), NAME);
        assertEquals(fish.getType(), TYPE);
    }

    @Test
    public void testGetById_nullOutput(){
        when(fishService.get(anyLong())).thenReturn(null);
        Fish fish = fishController.getFishById(123L);
        assertNull(fish);
    }

    private Fish getFish(){
        return new Fish(
                NAME,
                TYPE,
                WEIGHT
        );
    }
}
