# Istio Demo

```
kubectl create -f <(istioctl kube-inject -f deployments/frontend.yaml)
kubectl create -f <(istioctl kube-inject -f deployments/foo.yaml)
kubectl create -f <(istioctl kube-inject -f deployments/bar.yaml)
```