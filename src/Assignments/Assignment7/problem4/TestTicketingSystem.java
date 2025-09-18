package Assignments.Assignment7.problem4;

public class TestTicketingSystem {
    public static void main(String[] args) {
        TicketingSystem system= new TicketingSystem();
        System.out.println(system.hasTickets());
        system.addTicket("Issue with login");
        system.addTicket("Payment failed");
        System.out.println("Viewing Ticket :"+system.viewTicket());
        System.out.println(system.hasTickets());
        system.addTicket("Error 404 on dashboard");
        System.out.println("Next ticket: " + system.viewTicket());
        System.out.println(system);
        while (system.hasTickets()) {
            Ticket processed = system.processTicket();
            System.out.println("Processing ticket: " + processed);
        }

        System.out.println("All tickets processed.");
        System.out.println(system);


    }
}
/*
Sample Output:

false
Viewing Ticket :Ticket[ ID :1751, Description :Issue with login ]
true
Next ticket: Ticket[ ID :1751, Description :Issue with login ]
Pending Tickets
Ticket[ ID :1751, Description :Issue with login ]
Ticket[ ID :1752, Description :Payment failed ]
Ticket[ ID :1753, Description :Error 404 on dashboard ]

Processing ticket: Ticket[ ID :1751, Description :Issue with login ]
Processing ticket: Ticket[ ID :1752, Description :Payment failed ]
Processing ticket: Ticket[ ID :1753, Description :Error 404 on dashboard ]
All tickets processed.
No Pending Tickets

 */