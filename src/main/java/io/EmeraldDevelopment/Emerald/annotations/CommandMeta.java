package io.EmeraldDevelopment.Emerald.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Class header annotation used to identify a command.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandMeta {

    // The text that the command is assigned to.
    String command();
    // The usage of the command.
    String usage() default "No usage provided.";
    // The command's description
    String description() default "No description provided.";
    // Toggles whether permissions should be used for this command.
    boolean usePermissions() default false;
}