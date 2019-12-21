package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class MoveController {

    public boolean applyFigure(final Field field, final Point point, final String figure) {
        if (point.x <= 0 || point.x > field.getSize() || point.y <= 0 || point.y > field.getSize()) {
            return false;
        }
        if (field.getFigure(point) != null) {
            return false;
        }
        field.setFigure(point,figure);
        return true;
    }
}
