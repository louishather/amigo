import { App } from "aws-cdk-lib";
import { Template } from "aws-cdk-lib/assertions";
import { ImageCopierLambda } from "./image-copier-lambda";

describe("the lambda stack", () => {
  it("matches the snapshot", () => {
    const app = new App();
    const stack = new ImageCopierLambda(app, "IntegrationTest", {
      stack: "cdk",
      stage: "TEST",
    });
    const template = Template.fromStack(stack);
    expect(template.toJSON()).toMatchSnapshot();
  });
});
