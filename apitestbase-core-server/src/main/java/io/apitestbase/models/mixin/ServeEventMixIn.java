package io.apitestbase.models.mixin;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import io.apitestbase.resources.ResourceJsonViews;

/**
 * MixIn for {@link com.github.tomakehurst.wiremock.stubbing.ServeEvent}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonView({ResourceJsonViews.MockServerStubRequestList.class, ResourceJsonViews.MockServerUnmatchedRequestList.class})
public class ServeEventMixIn {
}
