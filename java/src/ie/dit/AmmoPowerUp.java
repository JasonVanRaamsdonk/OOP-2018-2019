package ie.dit;

import processing.core.PVector;

public class AmmoPowerUp extends GameObject
{ 
    public AmmoPowerUp(YASC yasc)
    {
        super(yasc, yasc.random(0, yasc.width), yasc.random(0, yasc.height), 0, 2);
        forward.x = yasc.random(-1, 1);
        forward.y = yasc.random(-1, 1);
    }

    @Override
    public void update()
    {
        // pos += forward * speed;
        pos.add(PVector.mult(forward, speed));
        rotation += 0.01f;
    }

    int size = 20;
    @Override
    public void render()
    {
        yasc.pushMatrix();
        yasc.translate(pos.x, pos.y);
        yasc.rotate(rotation);
        yasc.rect(-size /2, -size / 2, size, size);
        yasc.popMatrix();
    }
}