package af.asr.identity.api.v1.events;

@SuppressWarnings("unused")
public interface EventConstants {

    String DESTINATION = "identity-v1";
    String OPERATION_HEADER = "operation";

    String OPERATION_AUTHENTICATE = "auth";

    String OPERATION_POST_PERMITTABLE_GROUP = "post-permittablegroup";

    String OPERATION_POST_ROLE = "post-role";
    String OPERATION_PUT_ROLE = "put-role";
    String OPERATION_DELETE_ROLE = "delete-role";

    String OPERATION_POST_USER = "post-user";
    String OPERATION_PUT_USER_ROLEIDENTIFIER = "put-user-roleidentifier";
    String OPERATION_PUT_USER_PASSWORD = "put-user-password";

    String OPERATION_PUT_APPLICATION_SIGNATURE =   "put-application-signature";
    String OPERATION_DELETE_APPLICATION = "delete-application";
    String OPERATION_POST_APPLICATION_CALLENDPOINTSET = "post-application-callendpointset";
    String OPERATION_PUT_APPLICATION_CALLENDPOINTSET = "put-application-callendpointset";
    String OPERATION_DELETE_APPLICATION_CALLENDPOINTSET = "delete-application-callendpointset";
    String OPERATION_POST_APPLICATION_PERMISSION = "post-application-permission";
    String OPERATION_DELETE_APPLICATION_PERMISSION = "delete-application-permission";
    String OPERATION_PUT_APPLICATION_PERMISSION_USER_ENABLED = "put-application-permission-user-enabled";

    String SELECTOR_AUTHENTICATE = OPERATION_HEADER + " = '" + OPERATION_AUTHENTICATE + "'";

    String SELECTOR_POST_PERMITTABLE_GROUP = OPERATION_HEADER + " = '" + OPERATION_POST_PERMITTABLE_GROUP + "'";

    String SELECTOR_POST_ROLE = OPERATION_HEADER + " = '" + OPERATION_POST_ROLE + "'";
    String SELECTOR_PUT_ROLE = OPERATION_HEADER + " = '" + OPERATION_PUT_ROLE + "'";
    String SELECTOR_DELETE_ROLE = OPERATION_HEADER + " = '" + OPERATION_DELETE_ROLE + "'";

    String SELECTOR_POST_USER = OPERATION_HEADER + " = '" + OPERATION_POST_USER + "'";
    String SELECTOR_PUT_USER_ROLEIDENTIFIER = OPERATION_HEADER + " = '" + OPERATION_PUT_USER_ROLEIDENTIFIER + "'";
    String SELECTOR_PUT_USER_PASSWORD = OPERATION_HEADER + " = '" + OPERATION_PUT_USER_PASSWORD + "'";

    String SELECTOR_PUT_APPLICATION_SIGNATURE = OPERATION_HEADER + " = '" + OPERATION_PUT_APPLICATION_SIGNATURE + "'";
    String SELECTOR_DELETE_APPLICATION = OPERATION_HEADER + " = '" + OPERATION_DELETE_APPLICATION + "'";
    String SELECTOR_POST_APPLICATION_CALLENDPOINTSET = OPERATION_HEADER + " = '" + OPERATION_POST_APPLICATION_CALLENDPOINTSET + "'";
    String SELECTOR_PUT_APPLICATION_CALLENDPOINTSET = OPERATION_HEADER + " = '" + OPERATION_PUT_APPLICATION_CALLENDPOINTSET + "'";
    String SELECTOR_DELETE_APPLICATION_CALLENDPOINTSET = OPERATION_HEADER + " = '" + OPERATION_DELETE_APPLICATION_CALLENDPOINTSET + "'";
    String SELECTOR_POST_APPLICATION_PERMISSION = OPERATION_HEADER + " = '" + OPERATION_POST_APPLICATION_PERMISSION + "'";
    String SELECTOR_DELETE_APPLICATION_PERMISSION = OPERATION_HEADER + " = '" + OPERATION_DELETE_APPLICATION_PERMISSION + "'";
    String SELECTOR_PUT_APPLICATION_PERMISSION_USER_ENABLED = OPERATION_HEADER + " = '" + OPERATION_PUT_APPLICATION_PERMISSION_USER_ENABLED + "'";
}