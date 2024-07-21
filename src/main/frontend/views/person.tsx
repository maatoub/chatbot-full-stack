import { AutoCrud } from "@vaadin/hilla-react-crud";
import PersonModel from "Frontend/generated/net/tronnebati/chatbootspringairagreact/entities/PersonModel";
import { PersonService } from "Frontend/generated/endpoints";

export default function Person() {
  return <AutoCrud service={PersonService} model={PersonModel} />;
}
