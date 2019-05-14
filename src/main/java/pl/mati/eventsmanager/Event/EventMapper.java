package pl.mati.eventsmanager.Event;

public class EventMapper {

    static EventDto toDto(Event event) {
        EventDto eventDto = new EventDto();
        eventDto.setId(event.getId());
        eventDto.setTitle(event.getTitle());
        eventDto.setDate(event.getDate());
        eventDto.setLatitude(event.getLatitude());
        eventDto.setLongitude(event.getLongitude());
        eventDto.setLocation(event.getLocation());
        eventDto.setPrice(event.getPrice());
        eventDto.setImgUrl(event.getImgUrl());
        return eventDto;
    }

    static Event toEntity(EventDto eventDto){
        Event eventToEntity = new Event();
        eventToEntity.setId(eventDto.getId());
        eventDto.setTitle(eventDto.getTitle());
        eventToEntity.setDate(eventDto.getDate());
        eventToEntity.setLatitude(eventDto.getLatitude());
        eventToEntity.setLongitude(eventDto.getLongitude());
        eventToEntity.setLocation(eventDto.getLocation());
        eventToEntity.setPrice(eventDto.getPrice());
        eventToEntity.setImgUrl(eventDto.getImgUrl());
        return eventToEntity;
    }

}
