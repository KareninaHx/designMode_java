package org.learn.hq.p3.c5;

/**
 * Created by 27 on 2023/11/12
 */
public class TicketMaker {
    private static int ticket;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker(){
        ticket = 1000;
    }

    public static TicketMaker getNextTicket(){
        TicketMaker.ticket++;
        return ticketMaker;
    }

    public static int getTicket() {
        return ticket;
    }
}
