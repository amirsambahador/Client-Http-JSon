package org.j2os.geteway;

public interface API {
    String BASE_URL="http://localhost:8081";
    String SAVE_PERSON=BASE_URL+"/person/save?name=%s&family=%s&salary=%s";
    String FIND_ALL_PERSON=BASE_URL+"/person/findAll";


}
