package com.github.angry_bird;

// import com.badlogic.gdx.Gdx;
// import com.badlogic.gdx.Screen;
// import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.*;
// import com.badlogic.gdx.physics.box2d.joints.MouseJoint;
// import com.badlogic.gdx.physics.box2d.joints.MouseJointDef;

public class RedBird extends Bird {
    public RedBird(World world) {
        super(world, new Texture("redbird.png"), "Red", new CircleShape(), 1.0f, 0.25f);
        BIRD_SCALE = 0.25f;
        spped_scale = -9f;
    }

}
