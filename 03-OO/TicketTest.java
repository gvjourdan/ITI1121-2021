class TicketTest {

    public static void main(String[] args){

        Ticket t1 = new Ticket();
        System.out.println(t1.getSerialNumber());
        Ticket t2 = new Ticket();
        System.out.println(t2.getSerialNumber());
        Ticket t3 = new Ticket();
        System.out.println(t3.getSerialNumber());
        System.out.println(t1.getSerialNumber());
        System.out.println(t2.getSerialNumber());
        System.out.println(t3.getSerialNumber());
        System.out.println(t3.getLastSerialNumber());
        System.out.println(Ticket.getLastSerialNumber());
    }
}

