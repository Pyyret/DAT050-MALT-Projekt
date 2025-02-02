package blackjack.controllers;

import blackjack.models.MainModel;
import blackjack.views.MainView;
import blackjack.views.State;

import java.awt.event.*;

/**
 * MainController, a controller for the program, MainView...
 *
 * @author Lukas Wigren
 */
public class MainController implements KeyListener, MouseListener, ComponentListener {
    private MainModel mainModel;
    private MainView mainView;

    public MainController(MainModel mainModel, MainView mainView) {
        this.mainModel = mainModel;
        this.mainView = mainView;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 122 -> mainModel.toggleFullscreen();
            case 27 -> mainModel.setState(State.MENU);
            // temp
            case 49 -> mainModel.setSize(500, 500);
            case 50 -> mainModel.setSize(800, 600);
            case 51 -> mainModel.setSize(1280, 720);
            default -> {
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void componentResized(ComponentEvent e) {
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }
}
