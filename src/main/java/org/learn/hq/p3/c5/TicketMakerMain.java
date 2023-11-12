package org.learn.hq.p3.c5;

/**
 * Created by 27 on 2023/11/12
 */
public class TicketMakerMain {
    public static void main(String[] args) {
        TicketMaker ticketMaker = TicketMaker.getNextTicket();
        System.out.println(TicketMaker.getTicket());
        TicketMaker ticketMaker2 = TicketMaker.getNextTicket();
        System.out.println(TicketMaker.getTicket());
        TicketMaker ticketMaker3 = TicketMaker.getNextTicket();
        System.out.println(TicketMaker.getTicket());

        System.out.println(ticketMaker == ticketMaker2);
        System.out.println();
    }


}
