package com.taskmonitor.Monitoramento_Tarefas.services;

public class GeneretedIdService {
    private static long idCounter = 1;

    public static synchronized long generateId() {
        return idCounter++;
    }

}
