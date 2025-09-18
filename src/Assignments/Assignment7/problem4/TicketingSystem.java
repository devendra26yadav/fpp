package Assignments.Assignment7.problem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TicketingSystem {
    private Queue<Ticket> tickets = new LinkedList<>();
    private int nextID;

    public TicketingSystem() {
        Random rd = new Random();
        this.nextID = rd.nextInt(1000, 5000);
    }

    public void addTicket(String description) {
        if (description == null || description.trim().isEmpty()) return;
        tickets.offer(new Ticket(nextID++, description));
    }

    public Ticket processTicket() {
        if (tickets.isEmpty()) return null;
        return tickets.remove();
    }

    public Ticket viewTicket() {
        if (tickets.isEmpty()) return null;
        return tickets.peek();
    }

    public boolean hasTickets() {
        return !tickets.isEmpty();
    }

    public int size() {
        return tickets.size();
    }

    @Override
    public String toString() {
        if (tickets.isEmpty()) return "No Pending Tickets";
        StringBuilder builder = new StringBuilder("Pending Tickets\n");
        for (Ticket ticket : tickets) {
            builder.append(ticket).append("\n");
        }
        return builder.toString();
    }
}
