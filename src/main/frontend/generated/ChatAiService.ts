import { EndpointRequestInit as EndpointRequestInit_1 } from "@vaadin/hilla-frontend";
import client_1 from "./connect-client.default.js";
async function askIllm_1(question: string, init?: EndpointRequestInit_1): Promise<string> { return client_1.call("ChatAiService", "askIllm", { question }, init); }
export { askIllm_1 as askIllm };
