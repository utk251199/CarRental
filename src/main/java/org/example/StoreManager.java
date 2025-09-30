package org.example;

import java.util.List;

public class StoreManager {

    List<Store> stores;

    StoreManager(List<Store> stores){
        this.stores = stores;
    }

    Store findStoreByPincode(int pincode){
        for(Store store:stores){
            if(store.location.getPinCode() == pincode)
                return store;
        }
        return null;
    }

    void addStore(Store store){
        stores.add(store);
    }

    void deleteStore(Store store){
        stores.remove(store);
    }
}
