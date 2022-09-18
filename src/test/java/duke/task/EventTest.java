package duke.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventTest {
    @Test
    public void testGetTask(){
        Event e = new Event("complete iP /at 19-09-2022");
        assertEquals("[E][ ]complete iP (at: 19 Sep 2022)", e.getTask());
    }
}
