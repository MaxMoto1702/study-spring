package com.rstyle.maxmoto1702.spitter.mvc;

import com.rstyle.maxmoto1702.spitter.SpitterService;
import com.rstyle.maxmoto1702.spitter.domain.Spittle;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.rstyle.maxmoto1702.spitter.mvc.HomeController.DEFAULT_SPITTLES_PER_PAGE;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

/**
 * Created by m on 13.04.2015.
 */
public class HomeControllerTest {

    @Test
    public void testShouldDisplayRecentSpittles() throws Exception {
        List<Spittle> expectedSpittles =
                asList(new Spittle(), new Spittle(), new Spittle());
        // Фиктивный объект SpitterService
        SpitterService spitterService = mock(SpitterService.class);
        when(spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE)).thenReturn(expectedSpittles);
        // Создать контроллер
        HomeController controller = new HomeController(spitterService);
        Map<String, Object> model = new HashMap<String, Object>();
        // Вызвать обработчик
        String viewName = controller.showHomePage(model);
        assertEquals("home", viewName);
        // Проверить результаты
        assertSame(expectedSpittles, model.get("spittles"));
        verify(spitterService).getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE);
    }
}
