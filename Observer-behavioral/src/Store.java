public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(Event.NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(Event.SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }

}