package pl.mati.eventsmanager.Event;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventRestController {

    private EventService eventService;

    public EventRestController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("")
    List<EventDto> findAllEvents() {
        return eventService.findAllevents();
    }

    @GetMapping("/{id}")
    ResponseEntity<EventDto> findEventById(@PathVariable Long id){
        EventDto eventById = eventService.getEventById(id);
        return ResponseEntity.ok(eventById);
    }

    @GetMapping("/count")
    int count() {
        return eventService.count();
    }



}
