package com.ticketmaster.services.persistence.repository.jpa;

import com.ticketmaster.services.persistence.entity.Ticket;
import com.ticketmaster.services.service.model.TicketModel;
import com.ticketmaster.services.persistence.repository.TicketRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

@Repository
public class TicketJpaModelRepository implements TicketRepository {
    private TicketEntityRepository ticketRepo;
    private final ModelMapper modelMapper;

    public TicketJpaModelRepository(TicketEntityRepository ticketEntityRepository, ModelMapper modelMapper) {
        this.ticketRepo = ticketEntityRepository;
        this.modelMapper = modelMapper;
    }

    public TicketModel findById(Long id) {
        Ticket ticket = ticketRepo.findById(id).orElse(null);

        return modelMapper.map(ticket, TicketModel.class);
    }
}
