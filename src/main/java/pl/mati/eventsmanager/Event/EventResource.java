package pl.mati.eventsmanager.Event;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EventResource {

    private EventService eventService;

    public EventResource(EventService eventService) {
        this.eventService = eventService;
    }


    @GetMapping("/imprezy")
    public String homepage(Model model) {
        List<EventDto> eventDtoList= eventService.findAllevents();
        model.addAttribute("eventDtoList", eventDtoList);
        return "events";
    }

}
