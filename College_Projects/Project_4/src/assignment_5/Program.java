/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_5;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Mrinal
 */
public class Program implements Serializable{
    private String id, name;
    private int sem, seat, btn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getBtn() {
        return btn;
    }

    public void setBtn(int btn) {
        this.btn = btn;
    }

    public Program() {
    }

    public Program(String id, String name, int sem, int seat, int btn) {
        this.id = id;
        this.name = name;
        this.sem = sem;
        this.seat = seat;
        this.btn = btn;
    }
}
